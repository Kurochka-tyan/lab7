package lab7;
import lab6.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
class CarSet implements Set<ЛегковыеАвтомобили> {
           private static final int MaxCARS = 15;
           private ЛегковыеАвтомобили[] elements = new ЛегковыеАвтомобили[MaxCARS];
           private int size = 0;

           public CarSet() {
           }

           public CarSet(ЛегковыеАвтомобили легковыеАвтомобили) {
               add(легковыеАвтомобили);
           }

           public CarSet(Collection<ЛегковыеАвтомобили> collection) {
               addAll(collection);
           }


           @Override
           public int size() {
               return size;
           }

           @Override
           public boolean isEmpty() {
               return size==0;
           }

           @Override
           public boolean contains(Object o) {
               Iterator<ЛегковыеАвтомобили> iterator = iterator();
               while (iterator.hasNext()) {
                   if (o.equals(iterator.next())) {
                       return true;
                   }
               }
               return false;
           }

           @Override
           public Iterator<ЛегковыеАвтомобили> iterator() {
               return new Iterator<ЛегковыеАвтомобили>() {
                   private int index = 0;
                   @Override
                   public boolean hasNext() {
                       return index < size;
                   }

                   @Override
                   public ЛегковыеАвтомобили next() {
                       return elements[index++];
                   }
               };
           }

           @Override
           public  Object[] toArray() {
               Iterator<ЛегковыеАвтомобили> легковыеАвтомобилиIterator = iterator();
               Object[] o = new Object[MaxCARS];
               int i = 0;
               while (легковыеАвтомобилиIterator.hasNext()){
                   o[i++] = легковыеАвтомобилиIterator.next();
               }
               return o;
           }

           @Override
           public <T> T[] toArray(T[] a) {
               return null;
           }

           @Override
           public boolean add(ЛегковыеАвтомобили легковыеАвтомобили) {
               elements[size++] = легковыеАвтомобили;
               return true;
           }

           @Override
           public boolean remove(Object o) {
               return false;
           }

           @Override
           public boolean containsAll(Collection<?> c) {
               Iterator<ЛегковыеАвтомобили>легковыеАвтомобилиIterator = iterator();
               Iterator<?> cIterator = c.iterator();
               while (cIterator.hasNext()){
                   while (легковыеАвтомобилиIterator.hasNext()){
                       if(cIterator.next() == легковыеАвтомобилиIterator.next()){
                           break;
                       }
                       return false;
                   }
               }
               return true;
           }

           @Override
           public boolean addAll(Collection<? extends ЛегковыеАвтомобили> c) {
               for (ЛегковыеАвтомобили легковыеАвтомобили : c) {
                   add(легковыеАвтомобили);
               }
               return false;
           }

           @Override
           public boolean retainAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean removeAll(Collection<?> c) {
               return false;
           }

           @Override
           public void clear() {

           }
       }
