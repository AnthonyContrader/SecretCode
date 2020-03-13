import { Component, OnInit } from '@angular/core';

import { SignUpDTO } from 'src/dto/signUpdto';
import { NgForm } from '@angular/forms';
import { UserService } from 'src/service/user.service';
import { Router } from '@angular/router';
import { UserDTO } from 'src/dto/userdto';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
   signUpDTO: SignUpDTO;
   usertoinsert: UserDTO = new UserDTO();

  constructor(private service: UserService, private router: Router) { }

  ngOnInit() {
  }
 
     
          
    
  }
  

