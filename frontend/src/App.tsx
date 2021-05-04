import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";

function App() {
  return (
    <>
      <NavBar />
      <main className="container">
        <h1 className="text-primary" >Alo HA Mundão!</h1>
        <DataTable />
      </main>
      <Footer />
    </>
  );
}

export default App;
