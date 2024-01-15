import { Component, OnInit } from '@angular/core';
import { User, UserService } from '../service/user.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  constructor(
    private userService: UserService,
  ) { }

  ngOnInit(): void {
    this.userService.getUsers().subscribe(data => {
      this.userList = data;
      console.log("userList = ", this.userList);
    });

  }

  userList: User[] = [];

}
