package com.akirachix.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        displayContact()

    }
    fun displayContact(){
        val contact1 = Contact("Jerry", "0794130744", "abu@gmail.com", "")
        val contact2 = Contact("Agnes", "0794230744", "aggy@gmail.com", "")
        val contact3 = Contact("Zippy", "0794330744", "caro@gmail.com", "")
        val contact4 = Contact("Unyolo", "0794140744", "dan@gmail.com", "")
        val contact5 = Contact("Tina", "0794130747", "emma@gmail.com", "")
        val contact6 = Contact("Faith", "0794136744", "faith@gmail.com", "")
        val contact7 = Contact("Jay", "0790130744", "jay@gmail.com", "")
        val contact8 = Contact("Mary", "0794136744", "faith@gmail.com", "")
        val contact9 = Contact("Luna", "0794136744", "faith@gmail.com", "")
        val contact10 = Contact("Atieno", "0794136744", "faith@gmail.com", "")


        val contactsList = listOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10)
        val contactsAdapter = ContactsAdapter(contactsList)
        binding.rvContacts.adapter = contactsAdapter
    }
}