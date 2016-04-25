package chapter.interfaces.abstractface;

/**
 * Created by kursk on 2016/4/25.
 */
interface RedisConnection
{
    int connect();
    boolean isConnected();
    int disconnect();
    int getDatabaseNumber();
}

/**
  * Abstract class which implements the interface.
  * This is called Abstract Interface
  *
  */
abstract class AbstractRedisConnection implements RedisConnection
{
    @Override
    public final int connect()
    {
    //... lots of code to connect to Redis
        int i=0;
        return i;
    }

    @Override
    public final boolean isConnected()
    {
    //... code to check Redis connection
        boolean f = true;
        return  f;
    }

    @Override
    public final int disconnect()
    {
    //... lots of code to disconnect from Redis and perform cleanup
        int i=0;
        return i;
    }

}

/**
  * A subclass which extends from the Abstract Interface
  *
  */
public class RedisOptOut extends AbstractRedisConnection {
    public int getDatabaseNumber(){
        int i=0;
        return i;
    }
}

class RedisCounters implements RedisConnection {

    // inner class extending Abstract Interface
    private class RedisConnectionForwarder extends AbstractRedisConnection {
        public void RedisConnectionForwarder() {
        }

        public int getDatabaseNumber(){
            int i=0;
            return i;
        }
    }

    RedisConnectionForwarder r = new RedisConnectionForwarder();

    @Override
    public int connect() {
    // Simply forward the request to the Forwarding class.
    return r.connect();
    }

    @Override
    public boolean isConnected() {
    // Simply forward the request to the Forwarding class.
    return r.isConnected();
    }

    @Override
    public int disconnect() {
    // Simply forward the request to the Forwarding class.
    return r.disconnect();
    }

    public int getDatabaseNumber(){
        return r.getDatabaseNumber();
    }

    /**
     * Other code specific to storing and retreiving **counters**
     */

}

