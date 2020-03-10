import { Component, OnInit } from "@angular/core";
import { SecuritypatternDTO } from 'src/dto/securitypatterndto';
import { SecuritypatternService } from 'src/service/securitypattern.service';




@Component({
    selector: 'app-securitypatterns',
    templateUrl: './securitypatterns.component.html',
    styleUrls: ['./securitypatterns.component.css']
})
export class SecuritypatternsComponent implements OnInit {


    securitypatterns: SecuritypatternDTO[];
    securitypatterntoinsert: SecuritypatternDTO = new SecuritypatternDTO();

    constructor(private service: SecuritypatternService){ }

    ngOnInit() {
        this.getSecuritypatterns();
    }

    getSecuritypatterns() {
        this.service.getAll().subscribe(securitypattern => this.securitypatterns = securitypattern);
    }

    delete(securitypattern: SecuritypatternDTO) {
        this.service.delete(securitypattern.ids).subscribe(() => this.getSecuritypatterns());
    }

    update(securitypattern: SecuritypatternDTO) {
        this.service.update(securitypattern).subscribe(() => this.getSecuritypatterns());
    }

    insert(securitypattern: SecuritypatternDTO) {
        this.service.insert(securitypattern).subscribe(() => this.getSecuritypatterns());
    }

    clear() {
        this.securitypatterntoinsert = new SecuritypatternDTO();
    }
}