import { Component, OnInit } from '@angular/core';
import { UserDTO } from 'src/dto/userdto';


/**ngOnInit è perprendere il nome dell'utente...vedi se prende anche i dati del team dell'utente */
@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent implements OnInit {
  user: UserDTO;
  /**my team e my progect */

 constructor() { }

  ngOnInit() {
    this.user = JSON.parse(localStorage.getItem('currentUser'));
 }

}
