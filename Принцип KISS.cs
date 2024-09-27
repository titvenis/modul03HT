//Избегание ненужного вложения кода
public void ProcessNumbers(int[] numbers)
{
    if (numbers == null || numbers.Length == 0) return;

    foreach (var number in numbers)
    {
        if (number > 0)
        {
            Console.WriteLine(number);
        }
    }
}
//Избегание ненужного использования LINQ
public void PrintPositiveNumbers(int[] numbers)
{
    Array.Sort(numbers);

    foreach (var number in numbers)
    {
        if (number > 0)
        {
            Console.WriteLine(number);
        }
    }
}
//Избегание избыточного использования исключений
public int Divide(int a, int b)
{
    return b == 0 ? 0 : a / b;
}

