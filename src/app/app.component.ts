import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from './_services/token-storage.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  private roles: string[];
  // sideBarOpen=true;
  isLoggedIn = false;
  showAdminBoard = false;
  showManagerBoard = false;
  showManagerCourseEnquirySummary = false;
  showManagerResourceEnquirySummary = false;
  // new
  showManagerSiteVisitView = false;


  username: string;

  constructor(private tokenStorageService: TokenStorageService) { }

  ngOnInit(): void {
    this.isLoggedIn = !!this.tokenStorageService.getToken();

    if (this.isLoggedIn) {
      const user = this.tokenStorageService.getUser();
      this.roles = user.roles;

      this.showAdminBoard = this.roles.includes('ROLE_ADMIN');
      this.showManagerBoard = this.roles.includes('ROLE_MANAGER');
      this.showManagerSiteVisitView = this.roles.includes('ROLE_MANAGER');
      this.showManagerCourseEnquirySummary = this.roles.includes('ROLE_MANAGER');
      this.showManagerResourceEnquirySummary = this.roles.includes('ROLE_MANAGER');


      this.username = user.username;
    }
  }

  // sideBarToggler(){
  //   this.sideBarOpen=!this.sideBarOpen;
  // }


  logout(): void {
    this.tokenStorageService.signOut();
    window.location.reload();
  }
}
