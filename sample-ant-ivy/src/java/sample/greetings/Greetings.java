package sample.greetings;

// standard packages/modules

// third-party packages/modules
import org.apache.log4j.Logger;

// application packages/modules

/**
 * Greetings module
 *
 * @author Tri H. Nguyen
 */
public class Greetings
{
   private static Logger m_sLog = Logger.getLogger(Greetings.class);

   private String m_strName;

   /**
    * Constructor
    *
    */
   public Greetings()
   {
      this.m_strName = null;   
   }

   /**
    * Constructor
    *
    * @param strName Name
    */
   public Greetings(String strName)
   {
      this.m_strName = strName;
   }

   /**
    * Set name
    *
    * @param strName Name to be set
    */
   public void setName(String strName)
   {
      this.m_strName = strName;
   }

   /**
    * Get name
    *
    * @return Return name
    */
   public String getName()
   {
      m_sLog.info("getName");
      return this.m_strName;
   }

   /**
    * Get message
    *
    * @return Return message
    */
   public String getGreetings()
   {
      m_sLog.info("getGreetings");
      return getGreetings(getName());
   }

   /**
    * Get message
    *
    * @param strName Name to be part of the message
    * @return Return message
    */
   public static String getGreetings(String strName)
   {
      return "!!! " + strName + "'s Greetings !!!";
   }
   public static void main(String[] args)
   {
        String strName = "TEST";
        if (args.length > 0)
        {
            strName = args[0];
        }
        
        final Greetings oGreetings = new Greetings(strName);
        m_sLog.info(oGreetings.getGreetings());
   }
}