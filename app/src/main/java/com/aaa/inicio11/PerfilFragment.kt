import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.aaa.inicio11.R

class PerfilFragment : Fragment() {

    private lateinit var perfilGmailTextView: TextView
    private lateinit var phoneTextView: TextView
    private lateinit var direccionTextView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_perfil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        perfilGmailTextView = view.findViewById(R.id.perfil_gmail)
        phoneTextView = view.findViewById(R.id.phone)
        direccionTextView = view.findViewById(R.id.direccion)

        // Acción de clic en el correo electrónico
        perfilGmailTextView.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:${perfilGmailTextView.text}")
            }
            startActivity(emailIntent)
        }

        // Acción de clic en el teléfono
        phoneTextView.setOnClickListener {
            val phoneIntent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:${phoneTextView.text}")
            }
            startActivity(phoneIntent)
        }

        // Acción de clic en la dirección
        direccionTextView.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("geo:0,0?q=${direccionTextView.text}")
            }
            startActivity(mapIntent)
        }
    }
}

