import { Component, OnInit } from '@angular/core';
import { AppComponent } from '../app.component';
import { Employee } from '../employee';
import { EmployeeDetailsService } from '../employee-details.service';

@Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styleUrls: ['./register-page.component.css']
})
export class RegisterPageComponent implements OnInit {

  employee: Employee=new Employee();
  message: any;
  
  constructor(private service:EmployeeDetailsService) { }

  ngOnInit() {
  }

  public registerNow(){
    let res=this.service.add(this.employee);
    this.message = res;
  }
}
