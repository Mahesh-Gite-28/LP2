Good morning sir/madam.

My mini project is a Calculator Application developed using Salesforce Cloud with Apex Programming Language and Visualforce Page.

The main objective of this project is to perform basic arithmetic operations such as:

1. Addition
2. Subtraction
3. Multiplication
4. Division

using Salesforce technologies.

For this project, I used two main components:

1. Apex Controller
2. Visualforce Page

The Apex Controller is used as the backend logic of the application, while the Visualforce Page is used as the frontend user interface.

First, I created an Apex class named:

CalculatorController

Inside this class, I declared three variables:

* num1
* num2
* result

The variables num1 and num2 store the numbers entered by the user, and the result variable stores the output after calculation.

I used the Decimal datatype because it supports decimal values and gives accurate division results.

I also used {get; set;} properties so that the Visualforce page can access these variables and exchange data with the Apex controller.

After that, I created four methods:

1. add()
2. subtract()
3. multiply()
4. divide()

Each method performs its respective arithmetic operation.

For example:

* add() performs addition
* subtract() performs subtraction
* multiply() performs multiplication
* divide() performs division

In the division method, I used an if condition to avoid division by zero errors.

After creating the Apex controller, I created a Visualforce page named:

CalculatorPage

The Visualforce page acts as the user interface of the application.

Inside the page:

* I used apex:form to create the form
* apex:inputText to accept user input
* apex:commandButton to call Apex methods
* apex:outputText to display the result

When the user enters two numbers and clicks a button like Add or Multiply, the Visualforce page sends the input values to the Apex controller.

Then the corresponding Apex method executes the calculation and stores the answer in the result variable.

Finally, the result is displayed back on the Visualforce page.

So the complete flow is:

User Input → Visualforce Page → Apex Controller → Calculation → Result Display

This project demonstrates the integration of frontend and backend in Salesforce using Visualforce and Apex.

Thank you.



zoror3249.302ab9431969@agentforce.com
ZoroRoronoa@2005