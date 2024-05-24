package com.example.myapplication

import android.content.DialogInterface
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    
    lateinit var  binding :ActivityMain3Binding

    private val trans = supportFragmentManager.beginTransaction()
    val fragOne = OneFrag()
    val fragTwo = TwoFrag()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        fabCallBack()
//        initFrag()
//        addNavAction()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_delete ->{
                Toast.makeText(this , "deleted" , Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.action_settings ->{
                Toast.makeText(this , "setting" , Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.actione_person ->{
                Toast.makeText(this , "person" , Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }





//    private  fun initFrag(){
//        trans.add(R.id.fragId , fragTwo)
//        trans.commit()
//    }


//    private fun addNavAction(){
//        binding.bottomNavBar.setOnItemSelectedListener { item ->
//            when(item.itemId){
//                R.id.pageHome -> {
//                    trans.remove(fragTwo)
//                    trans.add(R.id.fragId , fragOne)
//                    trans.commit()
//                    true
//                }
//
//                R.id.pageMusic -> {
//                    trans.remove(fragOne)
//                    trans.add(R.id.fragId , fragTwo)
//                    trans.commit()
//                    true
//                }
//
//                R.id.pageProfile -> {
//                    trans.remove(fragTwo)
//                    trans.add(R.id.fragId , fragOne)
//                    trans.commit()
//                    true
//                }
//                else -> false
//            }
//
//        }
//    }
    private  fun fabCallBack (){
        binding.FAB.setOnClickListener {
            showMyDialog()
        }
    }

    private fun showMyDialog() {
        val builder = AlertDialog.Builder(this)
        builder.apply {
            setTitle("Title")
            setMessage("message")
            setPositiveButton(
                "yes",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(
                        this@MainActivity3,
                        "yes",
                        Toast.LENGTH_SHORT
                    ).show()
                })

            setNegativeButton(
                "No",
                DialogInterface.OnClickListener { dialogInterface, i ->  Toast.makeText(
                    this@MainActivity3,
                    "No",
                    Toast.LENGTH_SHORT
                ).show()}
            )

            val dialog = builder.create()
            dialog.show()
        }
    }
}