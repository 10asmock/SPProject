# SPProject

A Selenium + Java framework which automates https://simpleprogrammer.com/

## About

A Selenium + Java framework which utilizes TestNG, Log4j, and Maven for dependencies to automate buying a product from https://simpleprogrammer.com/ and ensure login functionalities work. Additionally, HTML reports are generated at ```'test-output/ReportHTML.html'```. Screenshots on failure are in the process of being implemented.

Further test cases will be implemented in the near future.

The creation of SPProject has been authorized by John Sonmez, Founder of Simple Programmer.

## How to Use

Download this repository into any computer directory or run the following command: ```https://github.com/10asmock/SPProject.git```

Open a Java IDE such as ```Eclipse``` or ```IntelliJ```

Right click ```testng.xml```, ```Run As```, and finally ```1 TestNG Suite```

Alternatively, you can access and run individual test cases by going into ```src/test/java```

 Collapse a package named ```SimpleProgrammer```
 
 You will then be able to access the following files:
 
 - ```LoginApplication.java```: A Java file which logs the tester in with a dummy username and password.
 - ```ProductApplication.java```: A Java file which adds a Trust the Process T-Shirt into a cart and validates the product in the cart.
 - ```validateProduct.java```: A Java file which validates the product page Header by checking if it has the correct text.
 - ```validateTitle.java```: A Java file which validates the Header of the Simple Programmer forum after it is loaded and has the correct text.
 
In addition, all test case inputs are parameterized in a Java file titled ```dataProvider.java```. A tester is able to change the product size, product amount, and address by implementing the desired data and saving the file.
