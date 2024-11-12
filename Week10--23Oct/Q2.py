from pyDatalog import pyDatalog

pyDatalog.clear()

# Define terms for family relationships and degree of relationship
pyDatalog.create_terms('parent, child, sibling, grandparent, ancestor, common_ancestor, degree, cousin, X, Y, Z, Degree, Level, Result')

# 1. Define facts: Parent-child relationships
+ parent('John', 'Mary')
+ parent('John', 'Sam')
+ parent('Mary', 'Alice')
+ parent('Mary', 'Bob')
+ parent('Sam', 'Chris')
+ parent('Sam', 'Daisy')

# 2. Rules for family relationships

# Rule1: Define siblings based on shared parents
sibling(X, Y) <= (parent(Z, X) & parent(Z, Y) & (X != Y))

# Rule2: Define grandparents based on parent-child relationships
grandparent(X, Y) <= (parent(X, Z) & parent(Z, Y))

# Rule3: Calculate degree of relationship between two people
# Direct parent-child relationship (degree 1)
degree(X, Y, 1) <= parent(X, Y)
# Recursive rule to calculate degrees of separation
degree(X, Y, Degree) <= (parent(X, Z) & degree(Z, Y, Degree - 1))

# Rule4: Find common ancestors with degrees
ancestor(X, Y) <= parent(X, Y)
ancestor(X, Y) <= (parent(X, Z) & ancestor(Z, Y))
common_ancestor(X, Y, Z) <= (ancestor(Z, X) & ancestor(Z, Y) & (X != Y))

# Adding Family Members
def add_family_member(parent_name, child_name):
    + parent(parent_name, child_name)

# Identifying Cousins
# First cousins share a grandparent
cousin(X, Y, 'first') <= (grandparent(Z, X) & grandparent(Z, Y) & ~sibling(X, Y) & (X != Y))
# Second cousins share a great-grandparent (two levels up)
cousin(X, Y, 'second') <= (ancestor(Z, X) & ancestor(Z, Y) & degree(Z, X, 3) & degree(Z, Y, 3) & (X != Y))
# Third cousins share a great-great-grandparent (three levels up)
cousin(X, Y, 'third') <= (ancestor(Z, X) & ancestor(Z, Y) & degree(Z, X, 4) & degree(Z, Y, 4) & (X != Y))

# Tracing the earliest common ancestor of two people
def earliest_common_ancestor(person1, person2):
    common_ancestors = common_ancestor(person1, person2, Z)
    if common_ancestors:
        return common_ancestors[0][2]  # Returns the first common ancestor found

# Queries to retrieve family relationships
def get_siblings(person):
    return sibling(person, X)

def get_grandparents(person):
    return grandparent(X, person)

def get_cousins(person, level):
    return cousin(person, X, level)

# Example of usage
print("Siblings of Mary:", get_siblings('Mary'))
print("Grandparents of Alice:", get_grandparents('Alice'))
print("First cousins of Chris:", get_cousins('Chris', 'first'))
print("Earliest common ancestor of Alice and Chris:", earliest_common_ancestor('Alice', 'Chris'))

# Adding new family members
add_family_member('Alice', 'Eve')
print("Siblings of Eve:", get_siblings('Eve'))
