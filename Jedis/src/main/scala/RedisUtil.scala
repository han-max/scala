import java.util

import redis.clients.jedis.Jedis

object RedisUtil {
  def main(args: Array[String]): Unit = {
    val jedis = new Jedis("hadoop102",6379)
    //key
    val keys: util.Set[String] = jedis.keys("*")
import scala.collection.JavaConversions._
for (key <- keys){
  println(key)
}




  }
}
