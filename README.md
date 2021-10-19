# COMP8117_ASE_final_project
Advanced Software Engineer - Final Project

## Database
MongoDB has been used to setup the database. A database "EduKids" is created which contains two collections - Users and Models.

![ER Diagram](/database/diagram.jpeg)

* **Users**
The users collection consistes of all the attributes related to the user profile and information. It consists of the fields:
```
[
  {
    "_id" : ObjectId("60f4400adbf98230ef86905e"),
    "isEmailConfirmed": true,
    "role": "super-admin",
    "loginAttempts": 0,
    "name": "Shobhit",
    "email": "shobhit.narayan@gmail.com",
    "password": "shobhit",
    "Favorites": [
      ObjectId("616c0a9dddb39c65e48cc8ed"),
      ObjectId("616c0aa6ddb39c65e48cc8ee"),
    ],
    "createdAt": ISODate("2021-07-18T14:51:54.159Z"),
    "updatedAt": ISODate("2021-07-18T14:51:54.159Z"),
    "avatar": "/images/avatar.jpg"
  }
]
```
* **Models**
The models collection consists of all the AR models and their file links. This data will populate the list in the UI. It consists of the fields:
```
[
  {
    "_id": ObjectId("60f4400adbf98230ef86906e"),,
    "name": "Apple",
    "category": "Fruit",
    "source": "/images/fruits/apple.gltf",
    "placeholder": "/images/fruits/placeholder/apple.jpg",
    "sound": "/sounds/fruits/apple.mp3",
    "description": "An apple is an edible fruit produced by an apple tree. Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus."
  }
]
```

