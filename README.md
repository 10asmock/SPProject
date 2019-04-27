# SPProject

A Selenium + Java framework which automates https://simpleprogrammer.com/

## About

A Selenium + Java framework which utilizes TestNG, Log4j, and Maven for dependencies to automate buying a product from https://simpleprogrammer.com/ and ensure login functionalities work. Additionally, HTML reports are generated at ```'test-output/ReportHTML.html'```. Screenshots on failure are in the process of being implemented.

Further test cases will be implemented in the near future.

Permission to create SPProject has been authorized by John Sonmez, Founder of Simple Programmer.

## How to Use

In all methods, you will have to download this repository into any computer directory or run the following command: ```https://github.com/10asmock/SPProject.git```

Open a Java IDE such as ```Eclipse``` or ```IntelliJ```

### Method 1

Head into main project directory, scroll down until you see ```testng.xml```.

Right click ```testng.xml```, ```Run As```, and finally ```1 TestNG Suite```

### Method 2

Click ```File > Import```

Type "Maven" in the search box under Select an import source:

Select ```Existing Maven Projects```

Click ```Next```

Click ```Browse``` and select the SPProject folder that is the root of the Maven project (contains the ```pom.xml``` file)

Click ```Next```

Click ```Finish```

Open up ```Command Prompt``` and ```cd SPProject```

Do ```mvn compile```

Do ```mvn test```

### Method 3

Alternatively, you can access and run individual test cases by going into ```src/test/java```

 Collapse a package named ```SimpleProgrammer```
 
 You will then be able to access the following files:
 
 - ```LoginApplication.java```: A test case which logs the tester in with a dummy username and password.
 - ```ProductApplication.java```: A test case which adds a Trust the Process T-Shirt into a cart and validates the product in the cart.
 - ```validateProduct.java```: A test case which validates the product page Header by checking if it has the correct text.
 - ```validateTitle.java```: A test case which validates the Header of the Simple Programmer forum after it is loaded and has the correct text.
 - ```dataProvider.java```: All test case inputs are parameterized in a Java file titled ```dataProvider.java```. The tester is able to change the product size, product amount, and address by inputting the desired data and saving the file.
 
After testing, an HTML report logging test case success and failures will be created and stored at ```'test-output/ReportHTML.html'```.

## Accessing pageObjects

SPProject uses a Page Object Model (POM) design pattern for enhancing test maintenance, reducing code duplication, and tester readability. 

In order to access it go to ```src/main/java```

Collapse a package named ```pageObjects```

You will then be able to access the following files:

- ```SimpleProgrammerForum.java```: A Java file which accesses page elements of the main Simple Programmer forum home page in order to log in.
- ```TTPProductPage.java```: A Java file which contains the main product page and selects a clickable button to head to the Trust the Process T-Shirt store page.
- ```TTPStorePage.java```: A Java file which contains the Trust the Process T-Shirt store page. Elements to select the size and desired quantity have been implemented before sending the item to cart.
- ```TTPCartPage.java```: A Java file which heads to the cart page and selects web elements for shipping city, state, zip and validates product in cart.

