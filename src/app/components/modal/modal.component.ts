import { Component, Inject } from '@angular/core';
import { MatDialog, MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { AuthService } from 'src/services/auth.service';

export interface DialogData {
  nombreModal: String;
  mensaje: String;
}

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent {
  constructor(
    public authService: AuthService,
    public dialogRef: MatDialogRef<ModalComponent>,
    @Inject(MAT_DIALOG_DATA) public data: DialogData) {
  }

  public cerrarSession() {
    this.authService.logout();
  }
  
  public onNoClick(): void {
    this.dialogRef.close();
  }

}
