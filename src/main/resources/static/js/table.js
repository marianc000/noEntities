function div(val, className, id) {
return `<div${id ? ' id="' + id + '" ' : ''}${className ? ' class="' + className + '"' : ''}>${val}</div>`;
        }

function td(val) {
return `<td>${val??''}</td>`;
        }

function tr(val) {
return `<tr>${val}</tr>`;
        }

function row(vals) {
return tr(vals.map(v => td(v)).join(''));
        }

const COLS = [ 'TITLE', 'RELEASE_YEAR', 'LENGTH', 'REPLACEMENT_COST', 'RATING', 'RENTAL_RATE', 'LAST_UPDATE','AVAILABLE'];
        const YEAR_COLS = [ 'RELEASE_YEAR' ];
        const DATETIME_COLS = [ 'LAST_UPDATE'];
        const dfDateTime = new Intl.DateTimeFormat([], {   year:'numeric', month:'2-digit', day:'2-digit', 'hour':'2-digit', 'minute':'2-digit', 'second':'2-digit', hour12:false});
        const dfYear = new Intl.DateTimeFormat([], {   year:'numeric' });
export function table(data, title) {

return div(div(div(title, 'caption')
        + `<table>`
        + row(COLS)
        + data.map(o => row(COLS.map(k => {
        switch (k){
        case 'RELEASE_YEAR': return dfYear.format (o[k]);
                case 'LAST_UPDATE': return dfDateTime.format (o[k]);
                default:return o[k];
        }

        }))).join('')
        + `</table>`, 'table ' + title), 'wrapper', title);
        }
