import { ReactComponent as GithubIcon } from 'assets/img/Vector.svg'
import './styles.css'

function Navbar() {
    return (
        <header>
            <nav className='container'>
                <div className='dsmovie-nav-content'>
                    <h1>DSmovie</h1>
                    <a href="https://github.com/fsbs2">
                        <div className='dsmovie-contact-container'>
                            <GithubIcon />
                            <p className='dsmovie-contact-link'> /fsbs2</p>
                        </div>

                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;