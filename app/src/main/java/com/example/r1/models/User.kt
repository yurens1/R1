package com.example.r1.models

import android.provider.ContactsContract
import android.service.controls.templates.ThumbnailTemplate

data class User(

    var name: String,
    var telephone: String,
    var thumbnailUrl: String,
    var email: String,
    var cpf: String


)
