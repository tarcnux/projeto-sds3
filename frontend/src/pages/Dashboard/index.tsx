import Footer from "components/Footer";
import NavBar from "components/NavBar";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";
import DataTable from "components/DataTable";


const Dashboard = () => {
    return (
        <>
        <NavBar />
        <main className="container">
          <h1 className="text-primary py-3">Dashboard de Vendas</h1>
          <section className="row px-3">
            <div className="col-sm-6">
              <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
              <BarChart />
            </div>
            <div className="col-sm-6">
              <h5 className="text-center text-secondary">Todas as vendas</h5>
              <DonutChart />
            </div>
          </section>
          <div className="py-3">
            <h2 className="text-primary">Todas as vendas</h2>
          </div>
          <DataTable />
        </main>
        <Footer />
      </>
    );
  }
  
  export default Dashboard;