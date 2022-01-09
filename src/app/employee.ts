export class Employee {
    private id: number;
    private name: string;

    constructor(id:number=0,name:string=""){
        this.id=id;
        this.name=name;
    }

    public get eid()
    {
        return this.id;
    }

    public set eid(id)
    {
        this.id=id;
    }

    public get ename()
    {
        return this.name;
    }

    public set ename(name)
    {
        this.name=name;
    }
}
