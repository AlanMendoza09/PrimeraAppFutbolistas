package com.example.futbol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_futbolistas_k.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [FutbolistasKFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FutbolistasKFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_futbolistas_k, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        futbolistas_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = FutbolistasAdapter(createData())
        }
    }
    fun createData(): ArrayList<Futbolistas> {
        val futbolistas = ArrayList<Futbolistas>()

        futbolistas.add(Futbolistas(R.drawable.courtois, "Thibaut Courtois",  "Thibaut Courtois (Bree, Limburgo, Bélgica, 11 de mayo de 1992) es un futbolista belga que juega como portero en el Real Madrid Club de Fútbol de la Primera División de España desde la temporada 2018-19. Es internacional con la selección de fútbol de Bélgica desde 2011.", "Equipo Real Madrid"))
        futbolistas.add(Futbolistas(R.drawable.cr7,"Cristiano Ronaldo", "Cristiano Ronaldo, es un futbolista portugués que juega como delantero en la Juventus F. C. de la Serie A de Italia y en la selección de Portugal, de la cual es su capitán.", "Equipo Juventus"))
        futbolistas.add(Futbolistas(R.drawable.debruyne, "Kevin De Bruyne",  "Kevin De Bruyne (Drongen, Gante, Bélgica, 28 de junio de 1991) es un futbolista belga que juega como centrocampista en el Manchester City Football Club de la Premier League de Inglaterra, donde es el segundo capitán. Es internacional con la selección de Bélgica.", "Equipo Manchester City"))
        futbolistas.add(Futbolistas(R.drawable.griezmann, "Antoine Griezmann",  "Antoine Griezmann (Mâcon, Borgoña, Francia, 21 de marzo de 1991) es un futbolista profesional francés que juega como delantero para el F. C. Barcelona de la Primera División de España y la selección de Francia.", "Equipo Barcelona"))
        futbolistas.add(Futbolistas(R.drawable.haaland, "Erling Braut Haaland", "Erling Braut Haaland (Leeds, Inglaterra, Reino Unido, 21 de julio de 2000) es un futbolista profesional noruego que juega como delantero en el Borussia Dortmund de la Bundesliga y en la selección de Noruega.", "Equipo Borussia Dortmund"))
        futbolistas.add(Futbolistas(R.drawable.hazard,"Eden Hazard",  "Eden Hazard (Henao, Bélgica, 7 de enero de 1991) es un futbolista profesional belga que juega como extremo o centrocampista ofensivo en el club español Real Madrid y capitanea la selección de Bélgica. Es conocido por su creatividad, regate, y pases.", "Equipo Real Madrid"))
        futbolistas.add(Futbolistas(R.drawable.kroos,"Toni Kroos", "Toni Kroos (Greifswald, Pomerania Occidental, Alemania Oriental, 4 de enero de 1990) es un futbolista alemán. Desde la temporada 2014-15 juega como centrocampista en el Real Madrid Club de Fútbol de la Primera División de España. También es internacional absoluto con la selección de Alemania desde su debut el 3 de marzo de 2010, de la que es además segundo capitán.", "Equipo Real Madrid"))
        futbolistas.add(Futbolistas(R.drawable.mbappe,"Kylian Mbappé", "Kylian Mbappé Lottin (París, Isla de Francia, 20 de diciembre de 1998) es un futbolista francés de ascendencia argelina y camerunesa. Juega como delantero y su equipo actual es el París Saint-Germain Football Club de la Ligue 1 de Francia. Es internacional absoluto con la selección de Francia desde 2017.", "Equipo PSG"))
        futbolistas.add(Futbolistas(R.drawable.messi," Lionel Messi", "Lionel Andrés Messi Cuccittini (Rosario, Santa Fe; 24 de junio de 1987), conocido como Leo Messi, es un futbolista argentino que juega como delantero o centrocampista. Ha desarrollado toda su carrera en el F. C. Barcelona de la Primera División de España y en la selección de Argentina, equipos de los que es capitán.", "Equipo Barcelona"))
        futbolistas.add(Futbolistas(R.drawable.modric,"Luka Modrić", "Luka Modrić (Zadar, Yugoslavia, 9 de septiembre de 1985) es un futbolista croata. Desde 2012 juega como centrocampista en el Real Madrid Club de Fútbol de la Primera División de España. Es internacional con la selección de fútbol de Croacia, de la cual es su capitán. Vencedor del Balón de Oro y del Premio The Best al mejor jugador del mundo según la FIFA en 2018.", "Equipo Real Madrid"))
        futbolistas.add(Futbolistas(R.drawable.pogba,"Paul Pogba", "Paul Labile Pogba (Lagny-sur-Marne, 15 de marzo de 1993) es un futbolista francés de origen guineano que juega como centrocampista en el Manchester United Football Club de la Premier League de Inglaterra. Es internacional absoluto con la selección de Francia. Es hermano de los también futbolistas Florentin y Mathias.", "Equipo Manchester United"))
        futbolistas.add(Futbolistas(R.drawable.ramos,"Sergio Ramos","Sergio Ramos (Camas, Sevilla, España, 30 de marzo de 1986) es un futbolista español que juega como defensa en el Real Madrid Club de Fútbol de la Primera División de España desde la temporada 2005-06.", "Equipo Real Madrid"))
        futbolistas.add(Futbolistas(R.drawable.sterling,"Raheem Sterling","Raheem Shaquille Sterling (Kingston, condado de Surrey, Jamaica, 8 de diciembre de 1994) es un futbolista inglés que juega como delantero en el Manchester City F. C. de la Premier League de Inglaterra y con la selección de Inglaterra.", "Equipo Manchester City"))
        futbolistas.add(Futbolistas(R.drawable.suarez,"Luis Suárez","Luis Alberto Suárez Díaz (Salto, Uruguay, 24 de enero de 1987) es un futbolista uruguayo. Juega como delantero y su equipo actual es el Atlético de Madrid de la Primera División de España. Es internacional absoluto con la selección de fútbol de Uruguay, de la cual es el máximo goleador histórico. También posee ciudadanía italiana.", "Equipo Atletico de Madrid"))
        futbolistas.add(Futbolistas(R.drawable.vardy,"Jamie Vardy","Jamie Richard Vardy (Sheffield, Inglaterra, Reino Unido, 11 de enero de 1987) es un futbolista internacional inglés. Juega en la posición de delantero y actualmente milita en el Leicester City Football Club de la Premier League de Inglaterra.", "Equipo Leicester"))
        return futbolistas
    }
}