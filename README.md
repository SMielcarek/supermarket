# Supermarket checkout component
The supermarket checkout component has been built using REST API. Below is the list of possible operations the component can perform.

## Cart
Display welcome message:

`GET {appContext}/api/cart`

Perform checkout operation:

`GET {appContext}/api/cart/checkout`

Add product item to cart (id is a product id):

`PUT {appContext}/api/cart/add/{id}`

Delete product item from cart (id is a product id):

`DELETE {appContext}/api/cart/delete/{id}`

## Products
List of all available products in the market:

`GET {appContext}/api/products`

Retrieve the product from the market based on the product id:

`GET {appContext}/api/products/{id}`

## Compile project
To compile project, run maven command in the main project folder:

`mvn clean install`

Copy built WAR file to Tomcat webapps folder