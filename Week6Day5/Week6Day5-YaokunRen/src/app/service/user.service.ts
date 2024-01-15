import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(
    private http: HttpClient
  ) { }

  private userAPIURL = "https://jsonplaceholder.typicode.com/users";
  
  private userList: User[] = [];

  getUsers(): Observable<User[]> {
    if (this.userList.length) return of(this.userList);
    
    return this.http.get<User[]>(this.userAPIURL).pipe(
      tap(users => this.userList = users)
    );
  }
}

export interface User {
  id: number;
  name: string;
  username: string;
  email: string;
  address: {
    street: string;
    suite: string;
    city: string;
    zipcode: string;
    geo: {
      lat: string;
      lng: string;
    };
  };
  phone: string;
  website: string;
  company: {
    name: string;
    catchPhrase: string;
    bs: string;
  };
}
