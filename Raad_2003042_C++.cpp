#include <bits/stdc++.h>
using namespace std;

const int maximum_employees = 10;

class Employee
{
public:
  string name;
  int employee_ID;
  double salary;
  int age;
  Employee *manager;

  void print()
  {
    cout << "Name: " << name << endl;
    cout << "Employee code: " << employee_ID << endl;
    cout << "Salary: " << salary << endl;
    cout << "Age: " << age << endl;
  }

  Employee(string name, int employee_ID, double salary, int age)
  {
    this->name = name;
    this->employee_ID = employee_ID;
    this->salary = salary;
    this->age = age;
    this->manager = nullptr;
  }

  void setManager(Employee *manager)
  {
    this->manager = manager;
  }
};

class Manager : public Employee
{
private:
  Employee *supervised_Employees[maximum_employees];
  int number_of_employees;

public:
  Manager(string name, int employee_ID, double salary, int age) : Employee(name, employee_ID, salary, age)
  {
    number_of_employees = 0;
  }

  void addSupervisedEmployee(Employee *employee)
  {
    if (number_of_employees < maximum_employees)
    {
      supervised_Employees[number_of_employees] = employee;
      number_of_employees++;
      employee->setManager(this);
    }
  }

  void removeSupervisedEmployee(Employee *employee)
  {
    for (int i = 0; i < number_of_employees; i++)
    {
      if (supervised_Employees[i] == employee)
      {
        supervised_Employees[i] = supervised_Employees[number_of_employees - 1];
        number_of_employees--;
        employee->setManager(nullptr);
        break;
      }
    }
  }

  void print()
  {
    Employee::print();
    cout << "Supervised employees:" << endl;
    for (int i = 0; i < number_of_employees; i++)
    {
      cout << supervised_Employees[i]->name << endl;
    }
  }
};

int main()
{
  Employee e1("Ramiz", 589, 1500, 29);
  e1.print();

  Manager m1("Papon", 100, 20000, 49);
  m1.addSupervisedEmployee(&e1);
  m1.print();

  m1.removeSupervisedEmployee(&e1);
  m1.print();

  return 0;
}