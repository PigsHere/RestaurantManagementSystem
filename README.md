Restaurant Management System

This program simulates in words how a Restaurant is run and managed.

Main Features:

Menu Management: Create and display a menu with various food items, including their names, prices, and descriptions.

Employee Management: Define different types of employees (Chef, Sous Chef, Waiter, Manager) with unique responsibilities and display their information.

Job Management: Each employee post has been given a specific method.

Classes:

1. Models
FoodItems: Represents a food item with attributes like name, price, and description.
Menu: Manages food items and displays the menu.
Employees: Contains employees' information (name, post, address, email, employee number).
Chef: Inherits from Employees and includes methods for cooking dishes.
SousChef: Inherits from Chef and adds methods for supervising kitchen staff and assisting the head chef.
Waiter: Inherits from Employees and includes methods for serving customers.
Manager: Inherits from Employees and includes methods for scheduling employees.

2. Main
The main file creates food items and employees and displays the menu, employee information, and their job.
