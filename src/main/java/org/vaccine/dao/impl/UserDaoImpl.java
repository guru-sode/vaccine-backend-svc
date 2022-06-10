package org.vaccine.dao.impl;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.vaccine.dao.UserDao;
import org.vaccine.model.User;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Inject
    MongoClient client;

    private MongoCollection getCollection(){
        return client.getDatabase("vaccine").getCollection("user");
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                User user = new User();
                user.setName(document.getString("name"));
                user.setUserId(document.getString("userId"));
                user.setEmail(document.getString("email"));
                user.setMobile(document.getString("mobile"));
                users.add(user);
            }
        } finally {
            cursor.close();
        }

        return users;
    }
}
