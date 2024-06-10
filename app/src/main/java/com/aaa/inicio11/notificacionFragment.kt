package com.aaa.inicio11

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class NotificacionFragment : Fragment() {

    private val CHANNEL_ID = "novedades_channel"
    private val NOTIFICATION_ID = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notificacion, container, false)

        // Crear el canal de notificación si es necesario
        createNotificationChannel()

        // Referencia al RecyclerView
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)

        // Marcar todas como leídas
        val markAsRead = view.findViewById<TextView>(R.id.mark_as_read)
        markAsRead.setOnClickListener {
            // Aquí deberías marcar todas las notificaciones como leídas en tu lógica de datos
            sendNotification("Todas las notificaciones se han marcado como leídas")
        }

        // Ejemplo: Enviar una notificación al abrir el fragmento
        sendNotification("Novedades disponibles")

        return view
    }

    private fun createNotificationChannel() {
        // Crear el canal de notificación pero solo para API 26+ porque NotificationChannel es una nueva clase que no está incluida en la biblioteca de soporte.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            // Registrar el canal con el sistema; no se puede cambiar la importancia ni otras conductas de notificación después de esto.
            val notificationManager: NotificationManager =
                requireContext().getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotification(content: String) {
        val builder = NotificationCompat.Builder(requireContext(), CHANNEL_ID)
            .setSmallIcon(R.drawable.notificacion) // Debes tener un ícono de notificación en tu carpeta de drawables
            .setContentTitle("Notificación de Novedades")
            .setContentText(content)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(requireContext())) {

            if (ActivityCompat.checkSelfPermission(
                    requireContext(),
                    Manifest.permission.POST_NOTIFICATIONS
                ) != PackageManager.PERMISSION_GRANTED
            ) {

                return
            }
            notify(NOTIFICATION_ID, builder.build())
        }
    }
}
