import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Q1LibraryManagementSystem {

    // Data structure to store book information
    private static ArrayList<Book> bookList = new ArrayList<>();
    
    // JTable model for displaying books
    private static DefaultTableModel bookTableModel;

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a Menu Bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        // Create a Tool Bar
        JToolBar toolBar = new JToolBar();
        JButton addButton = new JButton("Add Book");
        JButton removeButton = new JButton("Remove Book");
        JButton searchButton = new JButton("Search");
        toolBar.add(addButton);
        toolBar.add(removeButton);
        toolBar.add(searchButton);
        frame.add(toolBar, BorderLayout.NORTH);

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Book Details Panel
        JPanel bookDetailsPanel = new JPanel(new GridLayout(6, 2));
        bookDetailsPanel.add(new JLabel("Title:"));
        JTextField titleField = new JTextField();
        bookDetailsPanel.add(titleField);

        bookDetailsPanel.add(new JLabel("Author:"));
        JTextField authorField = new JTextField();
        bookDetailsPanel.add(authorField);

        bookDetailsPanel.add(new JLabel("ISBN:"));
        JTextField isbnField = new JTextField();
        bookDetailsPanel.add(isbnField);

        bookDetailsPanel.add(new JLabel("Publication Year:"));
        JTextField yearField = new JTextField();
        bookDetailsPanel.add(yearField);

        bookDetailsPanel.add(new JLabel("Genre:"));
        String[] genres = {"Fiction", "Non-fiction", "Mystery", "Fantasy", "Biography"};
        JComboBox<String> genreBox = new JComboBox<>(genres);
        bookDetailsPanel.add(genreBox);

        bookDetailsPanel.add(new JLabel("Available:"));
        JCheckBox availabilityBox = new JCheckBox();
        bookDetailsPanel.add(availabilityBox);

        JButton addBookButton = new JButton("Add Book");
        JButton updateBookButton = new JButton("Update Book");
        bookDetailsPanel.add(addBookButton);
        bookDetailsPanel.add(updateBookButton);

        tabbedPane.addTab("Book Details", bookDetailsPanel);

        // Book List Panel
        JPanel bookListPanel = new JPanel(new BorderLayout());

        // Search bar
        JPanel searchPanel = new JPanel(new FlowLayout());
        JTextField searchField = new JTextField(20);
        JButton performSearchButton = new JButton("Search");
        searchPanel.add(searchField);
        searchPanel.add(performSearchButton);
        bookListPanel.add(searchPanel, BorderLayout.NORTH);

        // Table to display book list
        String[] columnNames = {"Title", "Author", "ISBN", "Genre", "Available"};
        bookTableModel = new DefaultTableModel(columnNames, 0);
        JTable bookTable = new JTable(bookTableModel);
        JScrollPane scrollPane = new JScrollPane(bookTable);
        bookListPanel.add(scrollPane, BorderLayout.CENTER);

        tabbedPane.addTab("Book List", bookListPanel);

        // Add tabbed pane to frame
        frame.add(tabbedPane, BorderLayout.CENTER);

        // Show the frame
        frame.setVisible(true);

        // Event handling for Add Book button
        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                String isbn = isbnField.getText();
                int year = Integer.parseInt(yearField.getText());
                String genre = (String) genreBox.getSelectedItem();
                boolean available = availabilityBox.isSelected();

                // Add book to list and table
                Book newBook = new Book(title, author, isbn, year, genre, available);
                bookList.add(newBook);
                bookTableModel.addRow(new Object[]{title, author, isbn, genre, available});
                
                // Clear input fields
                titleField.setText("");
                authorField.setText("");
                isbnField.setText("");
                yearField.setText("");
            }
        });

        // Implement other event handlers as necessary...
    }

    // Book class to represent a book
    static class Book {
        String title;
        String author;
        String isbn;
        int year;
        String genre;
        boolean available;

        public Book(String title, String author, String isbn, int year, String genre, boolean available) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.year = year;
            this.genre = genre;
            this.available = available;
        }
    }
}
