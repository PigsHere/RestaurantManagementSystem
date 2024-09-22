Restaurant Management System

This program basically simules in words how a Restaurant is run and managed.

Main Features:

Menu Management: Create and display a menu with various food items, including their names, prices, and descriptions.

Employee Management: Define different types of employees (Chef, Sous Chef, Waiter, Manager) with unique responsibilities and display their information.

Job Management: Each employee post has been given their own specific method.

Classes:

1. Models
FoodItems: Represents a food item with attributes like name, price, and description.
Menu: Manages a collection of food items and displays the menu.
Employees: A base class for all employee types, containing common attributes (name, post, address, email, employee number).
Chef: Inherits from Employees and includes methods for cooking dishes.
SousChef: Inherits from Chef and adds methods for supervising kitchen staff and assisting the head chef.
Waiter: Inherits from Employees and includes methods for serving customers.
Manager: Inherits from Employees and includes methods for scheduling employees.

3. Main
The main file creates food items and employees, displays the menu, employee information, and their job.
