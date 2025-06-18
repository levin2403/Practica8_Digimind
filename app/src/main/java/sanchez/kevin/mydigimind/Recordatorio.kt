package sanchez.kevin.mydigimind

import java.io.Serializable

data class Recordatorio (var nombre: String,
                         var dias: ArrayList<String>,
                         var tiempo: String) : Serializable