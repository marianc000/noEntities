import { table } from './table.js';
import {objectsFromRows} from './transform.js';

const BASE_URL = '/api/';

const PATHS = ['jpa', 'jdbc', 'jdbcTable'];
const links = '<div class="links">' + PATHS.map(p => `<a href="#${p}">${p}</a>`).join('') + '</div>';
//  
Promise.all(
        PATHS.map(path => fetch(BASE_URL + path).then(r => r.json()//.then(o => o.slice(0, 20))
        )))
        .then(([jpa, jdbc, jdbcTable ]) => {
            jdbcTable = objectsFromRows(jdbcTable);
            rootDiv.innerHTML = links + table(jpa, "jpa") + table(jdbc, "jdbc") + table(jdbcTable, "jdbcTable");
        });
 