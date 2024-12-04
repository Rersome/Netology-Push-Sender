package ru.netology.pusher

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import java.io.FileInputStream


fun main() {
    val options = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(FileInputStream("fcm.json")))
        .build()

    FirebaseApp.initializeApp(options)

//    val newPost = Message.builder()
//        .putData("action", "NEWPOST")
//        .putData("content", """{
//          "userId": 1,
//          "userName": "Vasiliy",
//          "postId": 2,
//          "postAuthor": "Netology",
//          "postText": "asdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfhdjqkwljewloqwjkl;dmalksjdlaksjddodqwdklqasdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfhasdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfhasdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfhasdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfhasdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfhasdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfhasdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfhasdasdasdasdasdasddasdasdasdasdqweqwjeqwklejaklsjdkasjlkdqwkljelkqwkdz,cmzlxmfh"
//        }""".trimIndent())
//        .setToken(token)
//        .build()
//
//    FirebaseMessaging.getInstance().send(newPost)

    val share = Message.builder()
        .putData("action", "SHARE")
        .putData("content", """{
          "userId": 1,
          "userName": "Vasiliy",
          "postId": 2,
          "postAuthor": "Netology"
        }""".trimIndent())
        .setToken(token)
        .build()

    FirebaseMessaging.getInstance().send(share)
//
//
//    val like = Message.builder()
//        .putData("action", "LIKE")
//        .putData("content", """{
//          "userId": 1,
//          "userName": "Vasiliy",
//          "postId": 2,
//          "postAuthor": "Netology"
//        }""".trimIndent())
//        .setToken(token)
//        .build()
//
//    FirebaseMessaging.getInstance().send(like)
}
