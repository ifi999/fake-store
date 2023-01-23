## Method


### Login
1. User Login - POST

### User
1. Get All - GET
2. Get a single - GET
3. Limit results - GET
4. Sort Results - GET
5. Add - POST
6. Update - PUT, PATCH
7. Delete - DELETE

### Cart
1. Get all - GET
2. Get a single - GET
3. Limit results - GET
4. Sort results - GET
5. get in date range - GET
6. get user cart - GET
7. Add new cart - POST
8. Update a cart - PUT, PATCH
9. Delete a cart - DELETE

### Products
1. Get all products - GET
2. Get a single Product - GET
3. Limit results - GET
4. Sort results - GET
5. Get all categories - GET
6. Get in category - GET
7. Add new product - POST
8. Update a product - PUT, PATCH
9. Delete a product - DELETE


---

## Output

### User
    {
        id:1,
        email:'John@gmail.com',
        username:'johnd',
        password:'m38rmF$',
        name:{
            firstname:'John',
            lastname:'Doe'
        },
        address:{
            city:'kilcoole',
            street:'7835 new road',
            number:3,
            zipcode:'12926-3874',
            geolocation:{
                lat:'-37.3159',
                long:'81.1496'
            }
        },
        phone:'1-570-236-7033'
    }

### Cart
    {
        id:1,
        userId:1,
        date:2020-10-10,
        products:[{productId:2,quantity:4},{productId:1,quantity:10},{productId:5,quantity:2}]
    }

### Products
    {
        id:1,
        title:'...',
        price:'...',
        category:'...',
        description:'...',
        image:'...'
    }


---

## Table


