package com.example.cattery.data

import com.example.cattery.R
import com.example.cattery.model.Refragato

class Datasource {

    fun loadRefragato(): List<Refragato>{

        return listOf<Refragato>(
            Refragato(R.string.refragato1, R.drawable.image1),
            Refragato(R.string.refragato2, R.drawable.image2),
            Refragato(R.string.refragato3, R.drawable.image3),
            Refragato(R.string.refragato4, R.drawable.image4),
            Refragato(R.string.refragato5, R.drawable.image5),
            Refragato(R.string.refragato6, R.drawable.image6),
            Refragato(R.string.refragato7, R.drawable.image7),
            Refragato(R.string.refragato8, R.drawable.image8),
            Refragato(R.string.refragato9, R.drawable.image9),
            Refragato(R.string.refragato10, R.drawable.image10),
        )

    }

}