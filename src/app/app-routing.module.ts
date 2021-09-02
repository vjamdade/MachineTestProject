import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardUserComponent } from './board-user/board-user.component';
import { BoardManagerComponent } from './board-manager/board-manager.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { ManagerSiteVisitViewComponent } from './manager-site-visit-view/manager-site-visit-view.component';
import { ManagerResourceEnquirySummaryComponent } from './manager-resource-enquiry-summary/manager-resource-enquiry-summary.component'
import { ManagerCourseEnquirySummaryComponent } from './manager-course-enquiry-summary/manager-course-enquiry-summary.component';

//imports for request
import { RequestsListComponent } from './requests-list/requests-list.component';
import { CreateRequestComponent } from './create-request/create-request.component';
import { UpdateRequestComponent } from './update-request/update-request.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'user', component: BoardUserComponent },
  { path: 'manager', component: BoardManagerComponent },

  { path: 'managerSiteVisitView', component: ManagerSiteVisitViewComponent },
  { path: 'managerCourseEnquirySummary', component: ManagerCourseEnquirySummaryComponent },
  { path: 'managerResourceEnquirySummary', component: ManagerResourceEnquirySummaryComponent },


  //Request Component paths
  {path:'requests-list',component: RequestsListComponent},
  {path:'create-request',component: CreateRequestComponent},
  {path:'update-request/:requestId',component: UpdateRequestComponent},

 

  { path: 'admin', component: BoardAdminComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
