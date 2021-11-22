package hu.zsoz.layoutinflaterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import hu.zsoz.layoutinflaterdemo.databinding.ActivityMainBinding
import hu.zsoz.layoutinflaterdemo.databinding.NoteRowBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var bindingNoteRow: NoteRowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            bindingNoteRow= NoteRowBinding.inflate(LayoutInflater.from(this.baseContext))
            bindingNoteRow.tvData.text = binding.etNote.text.toString()
            binding.layoutMain.addView(bindingNoteRow.root)
        }
    }
}

