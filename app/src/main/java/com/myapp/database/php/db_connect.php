<?php
$host = "127.0.0.1"; // or your MySQL server IP address
$port = 3306; // or your MySQL server port
$user = "root";
$password = "password";
$database = "My_Project";

$conn = new mysqli($host, $user, $password, $database, $port);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>
