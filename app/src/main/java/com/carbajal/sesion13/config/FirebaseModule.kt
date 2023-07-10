package com.carbajal.sesion13.config


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

import dagger.Provides
import javax.inject.Singleton


object FirebaseModule {
    @Provides
    @Singleton
    fun provideFirebaseAuthIntance(): FirebaseAuth{
        return FirebaseAuth.getInstance()
    }
    @Provides
    @Singleton
    fun provideFirebaseStoreIntance():FirebaseFirestore{
        return FirebaseFirestore.getInstance()
    }
    @Provides
    @Singleton
    fun provideFirebaseDatabaseInstance():FirebaseDatabase{
        return FirebaseDatabase.getInstance()
    }


}