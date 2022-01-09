import { Injectable } from '@angular/core';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeDetailsService {

  employees: Employee[]=[];

  constructor() { }

  public add(emp:Employee)
  {
    this.employees.push(emp);
    // console.log(this.employees);
    return "Employee Added Successfully";
  }

  public getemp()
  {
    return this.employees;
  }
}
