import { Component, OnInit, ViewChild } from '@angular/core';
import { Pace } from './paceModel';
import { PaceService } from '../Services/pace.service';
import {MatTableDataSource} from '@angular/material/table';
import { MatSort } from '@angular/material/sort';



@Component({
  selector: 'app-pace',
  templateUrl: './pace.component.html',
  styleUrls: ['./pace.component.css']
})
export class PaceComponent implements OnInit {

  paces: Pace[];

  constructor(private paceService: PaceService) {
    
   }
   @ViewChild(MatSort) sort: MatSort;

  ngOnInit() {
    this.paceService.findAllPaces().subscribe(data => {
      this.paces = data.splice(1,data.length);
    });
    
  }

  

}
