package ChatroomApp;

/**
* ChatroomApp/ChatroomHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Chatroom.idl
* Monday, November 26, 2018 6:51:15 o'clock PM GMT-06:00
*/

public final class ChatroomHolder implements org.omg.CORBA.portable.Streamable
{
  public ChatroomApp.Chatroom value = null;

  public ChatroomHolder ()
  {
  }

  public ChatroomHolder (ChatroomApp.Chatroom initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ChatroomApp.ChatroomHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ChatroomApp.ChatroomHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ChatroomApp.ChatroomHelper.type ();
  }

}