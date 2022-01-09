import { Component, OnInit } from '@angular/core';
import { map } from 'rxjs';
import { AppComponent } from '../app.component';
import { Employee } from '../employee';
import { EmployeeDetailsService } from '../employee-details.service';

@Component({
  selector: 'app-display-page',
  templateUrl: './display-page.component.html',
  styleUrls: ['./display-page.component.css']
})
export class DisplayPageComponent implements OnInit {

  emp: Employee[]=[];
  constructor(private service:EmployeeDetailsService) { }

  ngOnInit(){
     let resp=this.service.getemp();
     this.emp=resp;
  }

}

