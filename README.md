# COMP8117_ASE_final_project
Advanced Software Engineer - Final Project

## Database
MongoDB has been used to setup the database. A database "EduKids" is created which contains two collections - Users and Models.

![ER Diagram](/images/erd.jpg)

* **Users**
The users collection consistes of all the attributes related to the user profile and information. It consists of the fields:
```
[{
  "_id": {
    "$oid": "616c0606ddb39c65e48cc8ec"
  },
  "isEmailConfirmed": true,
  "role": "super-admin",
  "loginAttempts": 0,
  "name": "Shobhit",
  "email": "shobhit.narayan@gmail.com",
  "password": "shobhit",
  "Favorites": [
    {
      "$oid": "616c0a9dddb39c65e48cc8ed"
    },
    {
      "$oid": "616c0aa6ddb39c65e48cc8ee"
    }
  ],
  "createdAt": {
    "$date": "2021-10-14T18:30:00Z"
  }
}]
```
* **Models**
The models collection consists of all the AR models and their file links. This data will populate the list in the UI. It consists of the fields:
```
[{
  "_id": {
    "$oid": "616e5852f08c54a43193fdf9"
  },
  "name": "Apple",
  "category": "Fruit",
  "source": "/images/fruits/apple.gltf"
}]
```

