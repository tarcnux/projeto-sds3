const Footer = () => {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <p className="text-light">
                    App desenvolvido por &nbsp;
                    <a href="https://github.com/tarcnux" target="_blank" rel="noreferrer">Tarcísio Nunes</a>&nbsp;
                    sob orientação de &nbsp;
                    <a href="https://github.com/acenelio" target="_blank" rel="noreferrer">Nelio Alves</a>
                </p>
                <p className="text-light"><small><strong>Semana Spring React</strong><br />
                    Evento promovido pela escola DevSuperior: <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">@devsuperior.ig</a></small></p>
            </div>
        </footer>
    );
}

export default Footer;