from pyDatalog import pyDatalog

pyDatalog.clear()

# 1. Define inventory items with quantities and prices
class Inventory(pyDatalog.Mixin):
    def __init__(self, item_id, name, quantity, price, reorder_point):
        super().__init__()
        self.item_id = item_id
        self.name = name
        self.quantity = quantity
        self.price = price
        self.reorder_point = reorder_point

# 2. Declare Datalog facts for managing inventory items
+ Inventory(1, 'Widget', 100, 5.00, 20)
+ Inventory(2, 'Gadget', 50, 12.00, 15)
+ Inventory(3, 'Doodad', 75, 8.00, 10)

# 3. Rule to calculate total inventory value
def total_inventory_value():
    inventory_value = (Inventory.quantity[item] * Inventory.price[item] for item in Inventory)
    return sum(inventory_value)

# 4. Track stock levels and reorder points
def check_reorder():
    return [(item.name, item.quantity) for item in Inventory if item.quantity <= item.reorder_point]

# 5. Simulate sales and restocking transactions
def sell_item(item_id, quantity):
    for item in Inventory:
        if item.item_id == item_id and item.quantity >= quantity:
            item.quantity -= quantity
            print(f"Sold {quantity} of {item.name}. New quantity: {item.quantity}")
            return
    print("Insufficient stock or item not found.")

def restock_item(item_id, quantity):
    for item in Inventory:
        if item.item_id == item_id:
            item.quantity += quantity
            print(f"Restocked {quantity} of {item.name}. New quantity: {item.quantity}")
            return
    print("Item not found.")

# Usage example
print("Total Inventory Value:", total_inventory_value())
print("Items needing reorder:", check_reorder())

sell_item(1, 30)
restock_item(1, 50)
print("Updated Total Inventory Value:", total_inventory_value())
print("Items needing reorder:", check_reorder())
