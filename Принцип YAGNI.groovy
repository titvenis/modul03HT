// Создание многофункционального класса
public class User 
{
    public string Name { get; set; }
    public string Email { get; set; }
}

//Добавление ненужных настроек и конфигураций
public class FileReader
{
    public string ReadFile(string filePath)
    {
        /
        return "file content";
    }
}

//Добавление ненужных методов и функций
public class ReportGenerator
{
    public void GenerateReport(string format)
    {
        switch (format.ToLower())
        {
            case "pdf":
                
                break;
            case "excel":
                
                break;
            case "html":
                
                break;
            default:
                throw new ArgumentException("Неверный формат отчета");
        }
    }
}

