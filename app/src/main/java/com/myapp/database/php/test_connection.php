<?php
include 'db_connect.php'; // Include the database connection file

// Test the database connection
if ($conn->ping()) {
    echo "Connected successfully!";
} else {
    echo "Connection failed: " . $conn->connect_error;
}

// Close the database connection
$conn->close();
?>
