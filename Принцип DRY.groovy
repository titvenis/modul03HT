
//Использование параметризованных методов
public void Log(string level, string message)
{
    Console.WriteLine($"{level.ToUpper()}: {message}");
}

public void LogError(string message)
{
    Log("error", message);
}

public void LogWarning(string message)
{
    Log("warning", message);
}

public void LogInfo(string message)
{
    Log("info", message);
}
//Использование общих конфигурационных настроек
public class Config
{
    public static string ConnectionString = "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
}

public class DatabaseService
{
    public void Connect()
    {
        string connectionString = Config.ConnectionString;
        // Логика подключения к базе данных
    }
}

public class LoggingService
{
    public void Log(string message)
    {
        string connectionString = Config.ConnectionString;
        // Логика записи лога в базу данных
    }
}

