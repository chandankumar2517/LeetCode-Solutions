import java.text.SimpleDateFormat
import java.util.*


fun convertDate(dateInMilliseconds: Long, dateFormat: String): String? {
    val simpleDateFormat = SimpleDateFormat(dateFormat)
    return simpleDateFormat.format(dateInMilliseconds)
   // return format(dateFormat, dateInMilliseconds.toLong()).toString()
}