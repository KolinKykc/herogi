import { Component, OnChanges, OnInit,  } from '@angular/core';
import {User} from './userModel';
import {UserService} from '../Services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  users: User[];

  constructor( private userService: UserService ) { }
 

  ngOnInit() {
    this.userService.findAll().subscribe(data => {
      this.users = data.splice(1,data.length);
    });
  }

}
